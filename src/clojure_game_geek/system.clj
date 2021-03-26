(ns clojure-game-geek.system
  (:gen-class)
  (:require
    [com.stuartsierra.component :as component]
    [clojure-game-geek.schema :as schema]
    [clojure-game-geek.server :as server]
    [clojure-game-geek.db :as db]))

(defn new-system
  []
  (merge (component/system-map)
         (server/new-server)
         (schema/new-schema-provider)
         (db/new-db)))

(defonce sys-store (atom nil))


(defn -main [& _]
  (let [sys (component/start-system
             (-> (new-system)
                 (assoc-in [:server :port] 8989)))]
    (reset! sys-store sys)))

(defn stop []
  (when-let [sys @sys-store]
    (component/stop-system sys)
    (reset! sys-store nil)))

;; Rich comment block with redefined vars ignored
#_{:clj-kondo/ignore [:redefined-var]}
(comment
  (-main)
  (stop)


  ) ;; End of rich comment block

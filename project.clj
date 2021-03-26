(defproject clojure-game-geek "0.1.0-SNAPSHOT"
  :description "A tiny BoardGameGeek clone written in Clojure with Lacinia"
  :url "https://github.com/walmartlabs/clojure-game-geek"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.stuartsierra/component "1.0.0"]
                 [com.walmartlabs/lacinia "0.38.0"]
                 [com.walmartlabs/lacinia-pedestal "0.15.0"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.postgresql/postgresql "42.2.19"]
                 [com.mchange/c3p0 "0.9.5.5"]
                 [io.aviso/logging "0.3.2"]]
  :main clojure-game-geek/system
  )

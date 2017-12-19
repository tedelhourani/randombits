(ns user
  (:require [luminus-migrations.core :as migrations]
            [lab.config :refer [env]]
            [mount.core :as mount]
            lab.core))

(defn start []
  (mount/start-without #'lab.core/repl-server))

(defn stop []
  (mount/stop-except #'lab.core/repl-server))

(defn restart []
  (stop)
  (start))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))



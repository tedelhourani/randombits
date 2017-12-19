(ns lab.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[lab started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[lab has shut down successfully]=-"))
   :middleware identity})

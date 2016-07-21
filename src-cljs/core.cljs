(comment

(ns cheshire-cat.core)


(defn ^:export init []
  (js/alert "hi, you!"))

  )


(ns cheshire-cat.core
  (:require [clojure.browser.repl :as repl]))


(defn ^:export init []
  (repl/connect "http://localhost:9000/repl"))

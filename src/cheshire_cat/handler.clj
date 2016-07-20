(ns cheshire-cat.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [cheshire.core :as json]
             ))

(def my-map {:name "Igor" :surname "Makaruks"})
(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/cat" [] "Мяу!")
  (GET "/igor" []
       {:status 200
        :headers {"Content-Type" "application/json; charset=utf-8"}
        :body (json/generate-string my-map)})
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

(def my-map {:name "Igor" :surname "Makaruks"})
(json/generate-string my-map)

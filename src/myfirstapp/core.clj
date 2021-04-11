(ns myfirstapp.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

#(println "hello %" "annadi")

(def decrement (fn [x] (- x 1)))

(defn decrement_set [x]
  (map decrement x))

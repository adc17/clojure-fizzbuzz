(ns clojure-fizzbuzz.core
  (:gen-class))

(def fizzbuzz
  (fn [num]
    (cond
      (= (mod num 15) 0) "Fizzbuzz"
      (= (mod num 5) 0) "buzz"
      (= (mod num 3) 0) "fizz"
      :else num)))

(def fizzbuzz_loop
  (fn []
    (map fizzbuzz (range 1 31))))

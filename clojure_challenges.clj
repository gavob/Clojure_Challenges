
;Put digits in descending order
(defn desc-order [n]
  (Integer/parseInt (apply str 
    (sort > (map 
      (fn [^Character c] (Character/digit c 10)) (str n))))))

;Perimeter of squares in a rectangle
(defn perimeter [n]
  (*' 4 (reduce +' (take (inc n) (map first 
    (iterate (fn [[a b]] [b (+' a b)]) [1 1]))))))

;highest rank in array
(defn highest-rank [data]
  (ffirst (reverse (sort-by val (frequencies data)))))

;Odd or even
(defn odd-or-even [xs]
  (if(= (rem (reduce + xs) 2) 0) "even" "odd"))

;Exclamation mark remover
(defn remove-bang [s]
  (str (apply str (filter (fn [v] (not= v "!")) (clojure.string/split s #""))) "!"))

;XOR
(defn xor [a,b]
    (or (and a (not b)) (and b (not a))))

;Sum of positive
(defn positive-sum [xs]
  (reduce + (filter pos? (seq xs))))

;Sum of numbers between two given integers
(defn get-sum [a b]
  (if(= a b)
    a
    (if(< a b)
      (reduce + (range a (+ b 1)))
      (reduce + (range b (+ a 1)))
    )
  )
)
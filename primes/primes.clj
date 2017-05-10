(defn divisible?
  [x y]
  (zero? (mod x y)))

(defn prime?
  [x]
  (and (> x 1) (not-any? (partial divisible? x) (range 2 x))))

(println (map (fn [x] [x (prime? x)]) (range 1 15)))

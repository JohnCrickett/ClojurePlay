(require 'clojure.string)

(println (count (clojure.string/split (slurp (first *command-line-args*)) #" ")))

(require 'clojure.string)

(println (frequencies (clojure.string/split (slurp (first *command-line-args*)) #" ")))

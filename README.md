# ClojurePlay
Playing with Clojure

To run a simple script (without lein): 

`java -cp clojure-1.8.0.jar clojure.main script.clj`

To run a script using lein:

`lein repl`

Then:

`(load-file "script.clj")`

To create a lein app:

`lein new app hellolein`

then to run it (from that dir):

`lein run`

To create a distributable jar:

`lein ubeerjar`

The output will be in the target dir.

# Useful References:
Clojure Cheatsheet: https://clojure.org/api/cheatsheet


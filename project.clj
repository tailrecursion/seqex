(defproject n01se/seqex "1.0.1-SNAPSHOT"
            :description "Sequence Expressions."
            :url "http://github.com/jclaggett/seqex"
            :license {:name "Eclipse Public License - v 1.0"
                      :url "http://www.eclipse.org/legal/epl-v10.html"
                      :distribution :repo
                      :comments "same as Clojure"}
            :min-lein-version "2.0.0"

            :dependencies [[criterium "0.3.1"] [org.clojure/clojure "1.5.1"]]

            ;; Describe a performance specific test profile
            :test-selectors {:default (complement :perf), :perf :perf}

            :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
                       :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
                       :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
                       :1.2 {:dependencies [[org.clojure/clojure "1.2.0"]]}}
            :aliases {"1.5" ["with-profile" "1.5"]
                      "1.4" ["with-profile" "1.4"]
                      "1.3" ["with-profile" "1.3"]
                      "1.2" ["with-profile" "1.2"]}
            ;; Use this to allow YourKit to connect:
            ;; :jvm-opts ["-agentpath:yjp/libyjpagent.so"]
            )

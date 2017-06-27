(defproject cljs-ext "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.660"]]

  :plugins [[lein-cljsbuild "1.1.6" :exclusions [[org.clojure/clojure]]]]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler {:main cljs-ext.core
                                   :target :nodejs
                                   :output-wrapper true
                                   :output-to "extension.js"
                                   :optimizations :simple}}]})
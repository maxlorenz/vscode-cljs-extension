(ns cljs-ext.core
  "VSCode extension in ClojureScript"
  (:require [cljs.nodejs :as node]))
  
(def vscode (node/require "vscode"))
(def commands (.-commands vscode))
(def window (.-window vscode))

(defn say-hello-command []
  (.showInformationMessage window "hello world"))

(defn ^:export activate [context]
  (.registerCommand commands "extension.sayHello" say-hello-command)
  (.log js/console "Extension activated."))

(def -main (fn [] (activate nil)))
(set! *main-cli-fn* -main)
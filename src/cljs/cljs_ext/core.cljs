(ns cljs-ext.core
  "VSCode extension in ClojureScript"
  (:require ["vscode" :as vscode :refer (commands window)]))
  
(defn say-hello-command []
  (.showInformationMessage window "hello world"))

(defn activate [context]
  (.registerCommand commands "extension.sayHello" say-hello-command)
  (.log js/console "Extension activated."))

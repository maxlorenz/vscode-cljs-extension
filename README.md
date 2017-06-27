# VSCode cljs extension

An extension template for VSCode in pure cljs.
Builds using either `lein` or `shadow-cljs`.

## Why?

I want to see better/more VSCode extensions for Clojure(Script). And I don't want to write JS/TypeScript for that.

## How to build & run

You need either Lein or Shadow-cljs installed. (Read: Shadow-cljs as in no Java at all)

```zsh
> lein cljsbuild once # or auto
Compiling ClojureScript...
Compiling "extension.js" from ["src/cljs"]...
Successfully compiled "extension.js" in 6.992 seconds.
```

```zsh
> shadow-cljs compile extension
[...]
[:extension] Build completed. (14 files, 4 compiled, 0 warnings, 11.84s)
```

To start the extension just run (VSCode needs to be installed):

```zsh
> code .
```

and run the extension (the template registers a hello world info message that you can execute with `ctrl+shift+p`, `Hello World`).

And yes, you can access the clojure reader for formatting/linting etc. Yeah!
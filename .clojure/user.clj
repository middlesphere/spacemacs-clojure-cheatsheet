;; clojure -R:repl:add-lib:test:debug-tools:xb -m nrepl.cmdline -p 7888 -i -m "[refactor-nrepl.middleware/wrap-refactor,cider.nrepl/cider-middleware]"
;; lein update-in :dependencies conj \[org.clojure/tools.nrepl\ \"0.2.13\"\ \:exclusions\ \[org.clojure/clojure\]\] -- update-in :plugins conj \[refactor-nrepl\ \"2.4.0\"\] -- update-in :plugins conj \[cider/cider-nrepl\ \"0.18.0\"\] -- with-profile +mike-local repl :start :host :: :port 7888

;;Debug tools
(require 'spyscope.core)
(require 'sc.api)
(use 'debux.core)

(use 'clojure.tools.deps.alpha.repl)

;;(require 'rebel-readline.main)
;;(rebel-readline.main/-main)
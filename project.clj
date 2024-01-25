(defproject hello-grpc "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"
            :year 2022
            :key "apache-2.0"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [io.pedestal/pedestal.service "0.6.3"]

                 ;; -- PROTOC-GEN-CLOJURE --
                 [io.github.protojure/grpc-server "2.8.1"]
                 [io.github.protojure/google.protobuf "2.0.1"]

                 [ch.qos.logback/logback-classic "1.4.14"]
                 [org.slf4j/jul-to-slf4j "2.0.11"]
                 [org.slf4j/jcl-over-slf4j "2.0.11"]
                 [org.slf4j/log4j-over-slf4j "2.0.11"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "hello-grpc.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.6.3"]]}
             :uberjar {:aot [hello-grpc.server]}}
  :main ^{:skip-aot true} hello-grpc.server)

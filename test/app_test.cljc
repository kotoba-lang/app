(ns app-test
  (:require [clojure.test :refer [deftest is testing]]
            [app]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? app))))

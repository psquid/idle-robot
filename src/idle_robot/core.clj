(ns idle-robot.core
  (:gen-class)
  (:import [java.awt Robot MouseInfo PointerInfo Point]))

(defn -main
  "Repeatedly moves mouse to simulate activity."
  [& args]
  (let [r (Robot.)]
    (while true
      (let [pointer-info (. MouseInfo getPointerInfo)
            mouse-point (. pointer-info getLocation)
            mouse-pos {:x (. mouse-point getX) :y (. mouse-point getY)}]
        (. r mouseMove (+ 10 (:x mouse-pos)) (+ 10 (:y mouse-pos)))
        (Thread/sleep 100)
        (. r mouseMove (:x mouse-pos) (:y mouse-pos))
        (Thread/sleep 4900)))))

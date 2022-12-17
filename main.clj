(println "Hello World!")

(println (macroexpand '(when boolean-expression
                expression1
                expression2
               )))
                      
                         
(defmacro infix
  "Use this macro when you pine for the notation of your childhood"
  [infixed]
  (list (second infixed) (first infixed) (last infixed)))


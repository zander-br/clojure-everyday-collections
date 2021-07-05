(ns loja.aula2)

; ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]

(defn conta
  [total-ate-agora elementos]
  (recur (inc total-ate-agora) (rest elementos)))

; (println (conta 0 ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))

(defn conta
  [total-ate-agora elementos]
  (if (next elementos)
    (recur (inc total-ate-agora) (next elementos))))

(println (conta 0 ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))

(defn conta
  [total-ate-agora elementos]
  (println total-ate-agora elementos)
  (if (next elementos)
    (recur (inc total-ate-agora) (next elementos))
    (inc total-ate-agora)))

(println (conta 0 ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
(println (conta 0 []))

(defn conta
  [total-ate-agora elementos]
  (if (seq elementos)
    (recur (inc total-ate-agora) (next elementos))
    total-ate-agora))

(println (conta 0 ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
(println (conta 0 []))

(defn minha-funcao
  ([parametro1] (println "p1" parametro1))
  ([parametro1 parametro2] (println "p2" parametro1 parametro2)))

(minha-funcao 1)
(minha-funcao 1 2)

(defn conta
  ([elementos] (conta 0 elementos))
  ([total-ate-agora elementos]
   (if (seq elementos)
     (recur (inc total-ate-agora) (next elementos))
     total-ate-agora)))

(println (conta 0 ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
(println (conta ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
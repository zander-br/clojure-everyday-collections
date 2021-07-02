(ns loja.aula1)

;["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]
;{"guilherme" 37, "paulo" 39}
;'(1 2 3 4 5)
;[[0 1]]
;#{}

; map
; reduce
; filter

(map println ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"])
(println (first ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
(println (rest ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
(println (rest []))
(println (next ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"]))
(println (next []))
(println (seq []))
(println (seq [1 2 3 4]))

(defn meu-mapa
  [funcao, sequencia]
  (let [primeiro (first sequencia)]
    (funcao primeiro)
    (meu-map funcao (next sequencia))))

; (meu-map println ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"])

(println "Meu mapa com paradas")
(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if primeiro
      (do
        (funcao primeiro)
        (meu-mapa funcao (rest sequencia))))))

(meu-mapa println ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"])
(meu-mapa println ["Daniela" false "Carlos" "Paulo" "Lucia" "Ana"])

(println "Meu mapa com parada no nil")

(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do
        (funcao primeiro)
        (meu-mapa funcao (rest sequencia))))))

(meu-mapa println ["Daniela" "Guilherme" "Carlos" "Paulo" "Lucia" "Ana"])
(meu-mapa println ["Daniela" false "Carlos" "Paulo" "Lucia" "Ana"])
(meu-mapa println [])
(meu-mapa println nil)

(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do
        (funcao primeiro)
        (recur funcao (rest sequencia))))))

(meu-mapa println (range 5000))
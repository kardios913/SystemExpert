
% configuracicon de aceptacion
validarsi(P,R) :- espregunta(P), esrespuesta(R).
validarno(P,R) :- espregunta(P), esrespuestano(R).

esrespuesta('si').
esrespuestano('no').


% Banco de preguntas sobre Codiv-19
espregunta(0). %¿Usted tiene tos?
espregunta(1). %¿Usted tiene escalofrios?
espregunta(2). %¿ha tenido Diarrea?
espregunta(3). %¿tiene dolor de garganta?
espregunta(4). %¿ha tenido dolores musculares?
espregunta(5). %¿Tiene dolor de cabeza?
espregunta(6). %¿ha tenido fiebre de 38° o mas?
espregunta(7). %¿ha tenido dificultad para respirar?
espregunta(8). %¿Ha sentido cansancio y/ó debilidad?
espregunta(9). %¿ha viajado en los ultimos 14 dias?
espregunta(10). %¿ha visitado areas infectadas por Covid 19?
espregunta(11). %¿visito o ha cuidado pacientes con Covid 19 positivo?



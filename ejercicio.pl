% configuracicon de aceptacion

esrespuesta('si').
esrespuesta('no').

% Banco de preguntas sobre Codiv-19
espregunta('¿Usted tiene Tos?',X):-esrespuesta(X).
espregunta('¿Usted tiene escalofrios?',X):-esrespuesta(X).
espregunta('¿ha tenido Diarrea?',X):-esrespuesta(X).
espregunta('¿tiene dolor de garganta?',X):-esrespuesta(X).
espregunta('¿ha tenido dolores musculares?',X):-esrespuesta(X).
espregunta('¿Tiene dolor de cabeza?',X):-esrespuesta(X).
espregunta('¿ha tenido fiebre de 38° o mas?',X):-esrespuesta(X).
espregunta('¿ha tenido dificultad para respirar?',X):-esrespuesta(X).
espregunta('¿Ha sentido cansancio y/ó debilidad?',X):-esrespuesta(X).
espregunta('¿ha viajado en los ultimos 14 dias?',X):-esrespuesta(X).
espregunta('¿ha visitado areas infectadas por Covid 19?',X):-esrespuesta(X).
espregunta('¿visito o ha cuidado pacientes con Covid 19 positivo?',X):-esrespuesta(X).

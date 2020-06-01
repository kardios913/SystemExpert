
% configuracicon de aceptacion
validarsi(P,R) :- espregunta(P), esrespuesta(R).
validarno(P,R) :- espregunta(P), esrespuestano(R).

esrespuesta('si').
esrespuestano('no').

% Banco de preguntas sobre Codiv-19
espregunta(0).
espregunta('¿Usted tiene escalofrios?').
espregunta('¿ha tenido Diarrea?').
espregunta('¿tiene dolor de garganta?').
espregunta('¿ha tenido dolores musculares?').
espregunta('¿Tiene dolor de cabeza?').
espregunta('¿ha tenido fiebre de 38° o mas?').
espregunta('¿ha tenido dificultad para respirar?').
espregunta('¿Ha sentido cansancio y/ó debilidad?').
espregunta('¿ha viajado en los ultimos 14 dias?').
espregunta('¿ha visitado areas infectadas por Covid 19?').
espregunta('¿visito o ha cuidado pacientes con Covid 19 positivo?').

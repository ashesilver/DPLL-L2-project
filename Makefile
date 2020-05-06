JFLAGS=
JC=javac
.SUFFIXES: .java .class
.java.class: 
	$(JC) $*.java

CLASSES = \
	basicClasses/BinaireOP.java \
	basicClasses/Bot.java \
	basicClasses/Equivalence.java \
	basicClasses/Et.java \
	basicClasses/Non.java \
	basicClasses/Ou.java \
	basicClasses/Top.java \
	basicClasses/Var.java \
	basicClasses/Form.java \
	basicClasses/MonVisiteur.java \
	basicClasses/Visiteur.java \
	basicClasses/Implication.java \
	basicClasses/Clause.java \
	basicClasses/Core.java \
	basicClasses/Litteral.java \
	basicClasses/EnsembleClauses.java

default: classes

classes: $(CLASSES:.java=.class)

clean: 
	$(RM) basicClasses/*.class

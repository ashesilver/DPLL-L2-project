JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: 
	$(JC) $(JFLAGS) $*.java

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
	basicClasses/Implication.java \
	basicClasses/Clause.java \
	basicClasses/Core.java  

default: classes

classes: $(CLASSES:.java=.class)

clean: 
	$(RM) basicClasses/*.class
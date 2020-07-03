Fundamentals test

11.ClassB en ClassC erven over van de abstracte ClassA. ClassC implimenteert ook InterfaceA. Welke cases zullen compileren? (teken het diagram!)
<br>compiled ClassA variableA = new ClassA();
<br>compiled ClassA variableA = new ClassB();
<br>exeption InterfaceA variableA = newClassB();
<br>exeption Interface variableA = new ClassC();
<br>exeption ClassA variableA = new ClassC(); Interface variableB = new variableA;
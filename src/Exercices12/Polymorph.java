package Exercices12;

class Polymorph
{ public static void main(String[] args)
{
	System.out.println("after this 4 calls one of the constructor of base then child then again base then child");
final Forme[] tabFormes =
{
new Cercle("rouge"),
new Triangle("jaune")
};
Collect formes = new Collect(10);
// Une collection de formes
// contenant une copie des objets definis
// dans le tableau tabFormes
for (int i = 0; i < tabFormes.length; ++i)
	// HERE FORMES ARE INSERTED USING COPY CONSTRUCTOR AND IMPLICIT CASTING
	formes.add(new Forme(tabFormes[i]));
//	formes.add(tabFormes[i]);// CORRECTION SIMPLY ADD CHILD FORMS BASE CLASS CAN POINT TO SPECIALIZED ONES
formes.dessine();						
}
}
class Forme
{
private String couleur;
public Forme(String uneCouleur)
{
couleur = uneCouleur;
System.out.println("call of the constructor of Forme");
}
public Forme(Forme other)
{
this.couleur = other.couleur;
System.out.println("call of the copy constructor of forme");
}
public void dessine(){
System.out.println("Une forme " + couleur);
}
}
class Triangle extends Forme
{
public Triangle(String uneCouleur)
{
super(uneCouleur);
System.out.println("call of the constructor of triangle");
}
public Triangle(Triangle autreTriangle)
{
super(autreTriangle);
System.out.println("call of the copy constructor of triangle");
}
public void dessine()
{
super.dessine();
System.out.println("toute pointue");
}
}
class Cercle extends Forme
{
public Cercle(String uneCouleur)
{
super(uneCouleur);
System.out.println("call of the constructor of cercle");
}
public Cercle(Cercle autreCercle)
{
super(autreCercle);
System.out.println("call of the copy constructor of cercle");
}
public void dessine()
{
super.dessine();
System.out.println("toute ronde");
}
}
class Collect
{
private Forme collect[];
private int index;
public Collect(int indexMax)
{
collect = new Forme[indexMax];
index = -1;
}
public void add(final Forme a)
{
	System.out.println("before this a call to the copy constructor of forme followed by a call to the copy construcor of a child should be performed");
if (index < collect.length - 1)
{
++ index;
collect[index] = a;
}
}
public void dessine()
{
for (int i = 0; i <= index; ++i)
collect[i].dessine();
}
}
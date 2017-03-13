package geometrie;
import java.io.*;
import java.util.*;

class Test {
   public static void main(String[] args) throws IOException {
   /* 
        Cercle c = new Cercle();
        Rectangle r = new Rectangle(2,);
        
        r.coteHorizontal = 2;
        r.coteVertical = 3;
        c.rayon = 1.5;
        
        r.setCoteHorizontal(2);
        r.setCoteVertical(3);
        c.setRayon(10);
        
        System.out.println("rayon : " + c.getRayon());
        System.out.println("côté horizontal : " + r.getCoteHorizontal());
        System.out.println("côté vertical : " + r.getCoteVertical());
        
        
        Cercle c1 = new Cercle(1);
        Cercle c2 = new Cercle(2);
        System.out.println(c2.getRayon());
        c2 = new Cercle(c1);
        System.out.println(c2.getRayon());
        c1.setRayon(3);
        System.out.println(c2.getRayon());
        
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 8);
        System.out.println(r2.getCoteHorizontal());
        r2 = new Rectangle(r1);
        System.out.println(r2.getCoteHorizontal());
        r1.setCoteHorizontal(4);
        System.out.println(r2.getCoteHorizontal());
        */
        
        /*Cercle c = new Cercle(2);
        System.out.println(c.calculerLongueur());
        System.out.println(c.calculerAire());
        
        Rectangle r = new Rectangle(3, 4);
        System.out.println(r.calculerLongueur());
        System.out.println(r.calculerAire());
        
        System.out.println(r.estInscrit(c));
        System.out.println(c.estInscrit(r));
        r.setCoteHorizontal(3);
        r.setCoteVertical(4);
        c.setRayon(2.5);
        System.out.println(c.estInscrit(r));
        System.out.println(r.estInscrit(c));
        
        Losange l = new Losange(12);
        System.out.println(l.calculerLongueur());*/
        
        /*Cercle c = new Cercle(2);
        Rectangle r = c.inscrire();
        System.out.println(r);*/
        
        /*Rectangle r = new Rectangle(2,3);
        System.out.println(r.estCarre());
        r.setCoteHorizontal(3);
        System.out.println(r.estCarre());
        
        Point p = new Point();
        System.out.println(p);
        p.setX(5);
        p.setY(10);
        System.out.println(p);
        p = new Point(1, 2);
        System.out.println(p); 
        
        Figure f = new Figure();
        System.out.println(f); 
        
        Rectangle R = new Rectangle(10,5);
        R.deplacer(4,5);
        System.out.println(R); */ 
        
        /*File f = new File("figure.svg");
        FileWriter fw = new FileWriter(f);
        int i;
        fw.write("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"290\" height=\"20\">\n");
        Cercle c = new Cercle(10, new Point(10, 10));
        fw.write(c.toStringSVG() + "\n");
        for(i=1; i <= 9; i++){
            c.deplacer(30,0);
            fw.write(c.toStringSVG());
        }
        fw.write("</svg>\n");
        fw.close();*/
        
        /*Cercle c = new Cercle(10);
        c.setCentre(new Point(5, 15));
        c.zoomer(2);
        System.out.println(c+ "\n");
        c.deplacer(2,4);
        System.out.println(c+ "\n");
        Rectangle r = new Rectangle(2,4);
        r.zoomer(2);
        System.out.println(r+ "\n");
        r.deplacer(2,4);
        System.out.println(r+ "\n");*/
        /*Figure f = new Figure(new Point(5, 15));
        f.zoomer(2);
        System.out.println(f);*/
        
        /*List<Cercle> cercles = new ArrayList<Cercle>();
        cercles.add(new Cercle(10));
        cercles.add(new Cercle(2));
        cercles.add(new Cercle(5));
        Collections.sort(cercles);
        System.out.println(cercles);*/
        /*Cercle c = new Cercle(10, new Point(20, 20));
        c.setCouleur(new Couleur(255,0,0));
        System.out.println(c.toStringSVG());*/
        /*Losange l = new Losange(10);
        Rectangle r = l.pivoter();
        System.out.println(r.pivoter());
        l.zoomer(2);
        System.out.println(new Rectangle(10, 20).pivoter());
        l.deplacer(2,4);
        System.out.println(l);*/
	    System.out.println(new Losange(10).pivoter());
	    System.out.println(new Rectangle(10, 10).pivoter());
	    System.out.println(new Rectangle(10, 20).pivoter());
        
        
   }
}

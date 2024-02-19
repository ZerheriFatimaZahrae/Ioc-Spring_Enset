<h1>version de contrôle et Injection des dépendances</h1>
  <h3 style="color:#084C84 ;">Partie 1</h3>
  <p>
    1. Créer l'interface IDao avec une méthode getDate
  </p>
  <img  src="screenshots/img.png" alt="">
 <p>
2. Créer une implémentation de cette interface <br>
1 er implemntation : version Base de Donnees
</p>
<img src="screenshots/img_1.png" alt="">
<p>2 eme implemntation : version Web Service</p>
<img src="screenshots/img_2.png" alt="">
<p>3 eme implemntation : version Capteur</p>

<img src="screenshots/img_3.png" alt="">
<p>
3. Créer l'interface IMetier avec une méthode calcul
</p>
<img src="screenshots/img_4.png" alt="">

<p>
4. Créer une implémentation de cette interface en utilisant le couplage faible
</p>
<img src="screenshots/img_5.png" alt="">
<p>
5. Faire l'injection des dépendances : <br>
  a. Par instanciation statique
</p>
<img src="screenshots/img_6.png" alt="">
<p> b. Par instanciation dynamique</p>
<img src="screenshots/img_7.png" alt="">
<p>Fichier config.txt</p>
<img src="screenshots/img_8.png" alt="">
<p>
c. En utilisant le Framework Spring <br>
       - Version XML
</p>
<img src="screenshots/img_9.png" alt="">
<p>Fichier config.xml</p>
<img src="screenshots/img_10.png" alt="">
<p> - Version annotations</p>
<img src="screenshots/img_11.png" alt="">
<p>Execution :</p>
<img src="screenshots/img_12.png" alt="">









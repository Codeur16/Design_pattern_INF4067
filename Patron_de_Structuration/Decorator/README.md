# Decorator

## Decorator 

On prend un système qui possede des fenêtres simples affichant du texte dans
une zone définit. Quand le texte à afficher dépasse la zone d’affichage
prévue, une partie du texte n’est pas visible. On souhaite donner la possibilité à
ces fenêtres de pouvoir défiler verticalement ou horizontalement.

### Difference entre les classes et interfaces
**Fenet**

  - Abstract Fenetre       

    ```java
    package com.decorator.fenetre;

    public interface Fenetre {
        public void dessiner();
        public void decrire();
    }

    ```

  - Concrete Fenentre class

    ```java
    package com.decorator.fenetre;

    public class FenetreSimple implements Fenetre{


        @Override
        public void dessiner() {
        System.out.println("Dessine Fenetre Simple");
        }

        @Override
        public void decrire() {
            System.out.println("Decrire Fenetre Simple");
        }
    }
    ```

- Decorator

  - Abstract Decorator

    ```java
    package com.decorator.decorateur;

    import com.decorator.fenetre.Fenetre;

    abstract public class DecorateurFenetre implements Fenetre {
        protected Fenetre fenetreDecoree;

        DecorateurFenetre(Fenetre fenetre){
            this.fenetreDecoree = fenetre;
        }
    }

    ```

  - Concrete Decorator

    - DecorateurCurseurVertical

        ```java
        package com.decorator.decorateur;

        import com.decorator.fenetre.Fenetre;

        public class DecorateurCurseurVertical extends DecorateurFenetre{

            public DecorateurCurseurVertical(Fenetre fenetre) {
                super(fenetre);
            }

            @Override
            public void dessiner() {
                this.fenetreDecoree.dessiner();
                System.out.println("Decore Dessine DecorateurCurseurVertical");
            }

            @Override
            public void decrire() {
                this.fenetreDecoree.decrire();
                System.out.println("Decore Decrire DecorateurCurseurVertical");
            }

            public void dessineCurseurVertical(){
                System.out.println("Dessine DecorateurCurseurVertical");
            }
        }

        ```

    - DecorateurCurseurHorizontal

        ```java
        package com.decorator.decorateur;

        import com.decorator.fenetre.Fenetre;

        public class DecorateurCurseurHorizontal extends DecorateurFenetre{

            public DecorateurCurseurHorizontal(Fenetre fenetre) {
                super(fenetre);
            }

            @Override
            public void dessiner() {
                this.fenetreDecoree.dessiner();
                System.out.println("Decore Dessine DecorateurCurseurHorizontal");

            }

            @Override
            public void decrire() {
                this.fenetreDecoree.decrire();
                System.out.println("Decore Decrire DecorateurCurseurHorizontal");

            }

            public void dessineCurseurHorizontal(){
                System.out.println("Dessine DecorateurCurseurHorizontal");

            }
        }

        ```

- Main

    ```java
    import com.decorator.decorateur.DecorateurCurseurHorizontal;
    import com.decorator.decorateur.DecorateurCurseurVertical;
    import com.decorator.decorateur.DecorateurFenetre;
    import com.decorator.fenetre.Fenetre;
    import com.decorator.fenetre.FenetreSimple;

    public class Main {
        public static void main(String[] args) {

            Fenetre f = new FenetreSimple();

            DecorateurFenetre decorateurFenetreVerticale = new DecorateurCurseurVertical(f);

            DecorateurFenetre decorateurFenetreHorizontal = new DecorateurCurseurHorizontal(decorateurFenetreVerticale);

            decorateurFenetreHorizontal.decrire();

        }
    }
    ```

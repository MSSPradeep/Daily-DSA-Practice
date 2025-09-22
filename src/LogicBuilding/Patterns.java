package LogicBuilding;

public class Patterns {

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for(int i=1; i<=n;i++){
            for(int j =i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        for(int i=0;i<n;i++){
            for(int j =0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern8(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(int n) {
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern10(int n) {
        for(int i=0;i<n-1;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+j)%2==0 ? 1 : 0);
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j= i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern13(int n) {
        int count =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+count++);
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }

    public void pattern15(int i) {
    }
}

public class KlassNamensgebungen {
    static int classVariable;

    // Definition and Declaration
    int instanceVariable;

    static int function(){
        // Only Definition
        int a;
        return 0;
    }

    int method() {
        return 0;
    }

    int polymorphMethod(int a, int b){
        return b;
    }

    int polymorphMethod(int a){
        return a;
    }
}

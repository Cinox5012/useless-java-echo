public class Echo {
        public static void main(String []args){
			int i;
                if(args.length==0){
                        System.out.println("");
                }

                switch (args[0]) {
                        case "-s" :
                                i=1;
                                while(i<args.length){
                                        System.out.print(args[i]);
                                        i++; 
                                }
                                break;

                        case "--nospaces" :
                                i=1;
                                while(i<args.length){
                                        System.out.print(args[i]);
                                        i++; 
                                }
                                break;

                        case "-n":
                                i=1;
                                while(i<args.length){
                                        System.out.print(args[i] +" ");
                                        i++;        
                                }
                                break;

                        case "--nonewline":
                                i=1;
                                while(i<args.length){
                                        System.out.print(args[i] +" ");
                                        i++;        
                                }
                                break;

                        case "-h":
                                System.out.println("Usage: echo [OPTIONS] [STRING]");
                                System.out.println("Options:");
                                System.out.println("-h");
                                System.out.println("or \t\t\t Display this information");
                                System.out.println("--help");
                                System.out.println("");
                                System.out.println("-s");
                                System.out.println("or \t\t\t Do not separate arguments with spaces");
                                System.out.println("--nospaces");
                                System.out.println("");
                                System.out.println("-n");
                                System.out.println("or \t\t\t Do not output a newline(may not work with fish)");
                                System.out.println("--nonewline");
                                System.out.println("");

                                System.out.println("the following sequences are recognized:");
                                System.out.println("");
                                System.out.println("\\\\  backslash");
                                System.out.println("");
                                System.out.println("\\n  newline");
                                break;
                        default:
                                i=0;
                                while(i<args.length){
                                        System.out.print(args[i] +" ");
                                        i++;        
                                }
                                System.out.println(" ");
                                break;
                }

        }
} 
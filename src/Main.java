import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();

        obj.MainMenu();
    }

    public void MainMenu(){
        Scanner input = new Scanner(System.in);
        Main obj = new Main();

        System.out.println("=========================================");
        System.out.println("   Selamat datang di alat musik Mario Dandy");
        System.out.println("=========================================");
        System.out.println("1. Pelanggan");
        System.out.println("2. Karyawan");
        System.out.println("0. keluar");
        System.out.print("pilih pembayaran sebagai : ");
        int user = input.nextInt();

        switch (user){
            case 0:
                System.exit(0);
            case 1:
                obj.ClientDashboard();
            case 2:
                obj.EmployeeDashboard();
        }



    }

    public void ClientDashboard(){
        Scanner input = new Scanner(System.in);
        Pelanggan memberGold = new Pelanggan("Gold");
        Pelanggan memberSilver = new Pelanggan("Silver");
        Pelanggan memberPremium = new Pelanggan("Premium");
        Cashier kasir = new Cashier();
        GitarEletkrik Spanyol = new GitarEletkrik("Spanyol", "Amaa",1200000);
        GitarEletkrik Yamaha = new GitarEletkrik("Yamaha","Mio",1300000);
        GitarEletkrik PSG = new GitarEletkrik("PSG", "Neymar",1400000);
        GitarEletkrik heritage = new GitarEletkrik("Heritage","Malang",1350000);
        Gitar Chord = new Gitar("Chord", "Eminor",800000);
        Gitar Honda = new Gitar("Honda", "Zip",900000);

        System.out.println("=====================================");
        System.out.println("  Anda Membayar Sebagai Pelanggan");
        System.out.println("=====================================");


        String yes = null;

        do {
            System.out.print("Input Brand : ");
            String brand = input.nextLine();

            System.out.print("Input Model : ");
            String model = input.nextLine();


            if (brand.equalsIgnoreCase("Spanyol")) {
                Spanyol.isOnSale();
                kasir.addPrice(Spanyol.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();

            } else if(brand.equalsIgnoreCase("Yamaha")){
                Yamaha.isOnSale();
                kasir.addPrice(Yamaha.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if(brand.equalsIgnoreCase("PSG")){
                PSG.isOnSale();
                kasir.addPrice(PSG.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if(brand.equalsIgnoreCase("heritage")){
                heritage.isOnSale();
                kasir.addPrice(heritage.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if(brand.equalsIgnoreCase("Chord")){
                Chord.isOnSale();
                kasir.addPrice(Chord.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if (brand.equalsIgnoreCase("Honda")) {
                Honda.isOnSale();
                kasir.addPrice(Honda.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else {
                System.out.println("Maaf item anda tidak tersedia");
            }
        } while(yes.equalsIgnoreCase("y"));



        System.out.print("Apakah anda mempunyai kode voucher? (y/n) : ");
        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("y")){
            System.out.print("Masukkan kode voucher : ");
            String code = input.nextLine();
            kasir.addVoucher(code);
            System.out.println("anda mendapat potongan voucher sebesar "+(kasir.currentDiscounts[1]*100)+"%");
        } else {
            System.out.println("================================");
        }

        System.out.println("Apakah anda mempunyai member? : ");
        System.out.println("1. ya");
        System.out.println("2. tidak");
        System.out.print("Pilih menu : ");
        int menuMember = input.nextInt();

        input.nextLine();

        if(menuMember == 1) {
            System.out.print("Masukkan nama pelanggan : ");
            String name = input.nextLine();


            System.out.print("Masukkan member pelanggan : ");
            String member = input.nextLine();



            if (member.equalsIgnoreCase("silver")) {
                memberSilver.setName(name);
                System.out.println(memberSilver.isMember(member));
                kasir.addDisc(memberSilver.getMemberDiscount());
                System.out.println("Nama member : " + memberSilver.getName());
                System.out.println("Member Silver mendapatkan diskon : " + memberSilver.getMemberDiscount() * 100 + "%");
            } else if (member.equalsIgnoreCase("gold")) {
                memberSilver.setName(name);
                memberGold.isMember(member);
                kasir.addDisc(memberGold.getMemberDiscount());
                System.out.println("Nama member : " + memberGold.getMemberType());
                System.out.println("Member Gold mendapatkan diskon : " + memberGold.getMemberDiscount() * 100 + "%");
            } else if (member.equalsIgnoreCase("premium")) {
                memberSilver.setName(name);
                System.out.println(memberPremium.isMember(member));
                kasir.addDisc(memberPremium.getMemberDiscount());
                System.out.println("Nama member : " + memberPremium.getMemberType());
                System.out.println("Member Premium mendapatkan diskon: " + memberPremium.getMemberDiscount() * 100 + "%");
            } else {
                System.out.println("mohon maaf member anda tidak ada");
            }
        }

        kasir.setTotal();
        System.out.println("Total belanja anda : "+kasir.getTotal());
        System.out.println("====================================");
        System.out.print("Masukkan uang yang dibayarkan : ");
        double cash = input.nextInt();

        input.nextLine();

        System.out.println("Uang yang dibayarkan : " +cash);
        System.out.println("Kembalian : "+(cash - kasir.getTotal()));
        System.out.println("Terimakasih telah berbelanja di Toko Alat Musik Mario Dandy :)");
        System.out.print("Kembali menu utama ? (y/n)");
        String y = input.nextLine();

        if(y.equalsIgnoreCase("y")){
            MainMenu();
        } else{
            System.exit(0);
        }
    }


    public void EmployeeDashboard(){
        Scanner input = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        Cashier kasir = new Cashier();
        GitarEletkrik Spanyol = new GitarEletkrik("Spanyol", "Amaa",1200000);
        GitarEletkrik Yamaha = new GitarEletkrik("Yamaha","Mio",1300000);
        GitarEletkrik PSG = new GitarEletkrik("PSG", "Neymar",1400000);
        GitarEletkrik heritage = new GitarEletkrik("Heritage","Malang",1350000);
        Gitar Chord = new Gitar("Chord", "Eminor",800000);
        Gitar Honda = new Gitar("Honda", "Zip",900000);


        System.out.println("Anda membayar sebagai karyawan");



        String yes = null;

        do {
            System.out.print("Input Brand : ");
            String brand = input.nextLine();

            System.out.print("Input Model : ");
            String model = input.nextLine();


            if (brand.equalsIgnoreCase("Spanyol")) {
                Spanyol.isOnSale();
                kasir.addPrice(Spanyol.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();

            } else if(brand.equalsIgnoreCase("Yamaha")){
                Yamaha.isOnSale();
                kasir.addPrice(Yamaha.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if(brand.equalsIgnoreCase("PSG")){
                PSG.isOnSale();
                kasir.addPrice(PSG.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if(brand.equalsIgnoreCase("heritage")){
                heritage.isOnSale();
                kasir.addPrice(heritage.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if(brand.equalsIgnoreCase("Chord")){
                Chord.isOnSale();
                kasir.addPrice(Chord.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else if (brand.equalsIgnoreCase("Honda")) {
                Honda.isOnSale();
                kasir.addPrice(Honda.getDiscountedPrice());
                System.out.println("Current item price : "+kasir.currentPrice);
                System.out.println("==============================");
                System.out.print("Tambahkan item lain ? (y/n) : ");
                yes = input.nextLine();
            } else {
                System.out.println("Maaf item anda tidak tersedia");
            }
        } while(yes.equalsIgnoreCase("y"));

        System.out.print("Apakah anda mempunyai kode voucher? (y/n) : ");
        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("y")){
            System.out.print("Masukkan kode voucher : ");
            String code = input.nextLine();
            kasir.addVoucher(code);
            System.out.println("anda mendapat potongan voucher sebesar "+(kasir.currentDiscounts[1]*100)+"%");
            System.out.println("=========================================================");
        } else {
            System.out.println("================================");
        }

        kasir.addDisc(karyawan.discount);
        kasir.setTotal();
        System.out.println("Total belanja anda : "+kasir.getTotal());
        System.out.println("====================================");


        System.out.println("Masukkan uang yang dibayarkan : ");
        double cash = input.nextInt();

        input.nextLine();

        System.out.println();
        System.out.println("Uang yang dibayarkan : " +cash);
        System.out.println("Kembalian : "+(cash - kasir.getTotal()));
        System.out.println("Terimakasih telah berbelanja di Toko Alat Musik Mario Dandy :)");
        System.out.print("Kembali menu utama ? (y/n)");
        String y = input.nextLine();

        if(y.equalsIgnoreCase("y")){
            MainMenu();
        } else{
            System.exit(0);
        }
    }
    }



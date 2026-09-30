public class Main {
    public static void main(String[] args) {
        GenshinArchon archonList = new GenshinArchon();

        archonList.append("Venti");
        archonList.append("Zhongli");
        archonList.append("Raiden Shogun");
        archonList.append("Nahida");
        archonList.append("Furina");
        archonList.append("Mavuika");

        System.out.println("--- Daftar Archon Genshin ---");
        archonList.display();

        System.out.println("\n--- Cari Archon ---");
        String dicari = "Zhongli";
        Object hasil = archonList.searchArchon(dicari);

        if (hasil != null) {
            System.out.println("Ketemu! Archon: " + hasil);
        } else {
            System.out.println("Archon " + dicari + " tidak ditemukan.");
        }

        System.out.println("\n--- Hapus Head & Tail ---");
        archonList.removeHead(); 
        archonList.removeTail(); 

        
        archonList.display();
    }
}
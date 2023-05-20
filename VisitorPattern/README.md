## :diamond_shape_with_a_dot_inside: Visitor Pattern

**Visitor, Behavioral (Davranışsal) tasarım desenlerinden biridir. Visitor deseni, nesne yapısını değiştirmeden yeni operasyonlar eklemek veya mevcut operasyonları uygulamak için kullanılır. Bu desen, bir nesne yapısındaki elemanları ziyaret eden ve onlarla etkileşimde bulunan bir Visitor sınıfını tanımlar.**

**Visitor desenindeki ana bileşenler şunlardır:**

1. **Visitor (Ziyaretçi): Nesne yapısındaki elemanları ziyaret eden ve onlarla etkileşimde bulunan sınıftır. Visitor sınıfı, her bir eleman için ziyaret metotlarını tanımlar.**
2. **Element (Eleman): Visitor tarafından ziyaret edilecek olan nesnelerin ortak arayüzünü tanımlayan sınıftır. Element sınıfı, Visitor nesnesini kabul eden bir accept metodu içerir.**
3. **ConcreteElement (Somut Eleman): Element arayüzünü uygulayan ve ziyaret edilecek olan somut nesneleri temsil eden sınıflardır.**

**Visitor deseni, nesne yapısını değiştirmeden yeni operasyonlar eklemek veya mevcut operasyonları uygulamak için kullanılır. Bu desen, açıklandığı gibi nesnelerin üzerinde gezinerek onlarla etkileşime geçen bir ziyaretçi nesnesini tanımlar. Bu sayede, farklı eleman türlerine farklı davranışlar uygulanabilir ve yeni operasyonlar eklenmesi kolaylaşır.**

**Örneğin, bir belge yapısı düşünelim. Belge içerisinde farklı elemanlar bulunabilir: paragraflar, resimler, tablolar vb. Her bir elemanın farklı bir işlem yapması gerekebilir. Visitor deseni, belge elemanlarını ziyaret eden ve onlarla etkileşime geçen bir Visitor sınıfını tanımlar. Visitor sınıfı, her bir eleman için farklı işlemleri gerçekleştirir. Örneğin, bir belgeyi yazdırmak için PrintVisitor sınıfını kullanabiliriz. Bu sayede, belge içerisindeki farklı elemanlar üzerinde farklı yazdırma işlemleri uygulanabilir.**

**Bu şekilde, Visitor deseni, nesne yapısını değiştirmeden yeni operasyonlar eklemeyi sağlar. Bu desen, nesneler arasında sıkça değişen işlemler varsa veya yeni işlemler eklenmesi gerekiyorsa kullanışlı olabilir. Ayrıca, Open-Closed prensibine (yazılıma yeni özellikler eklemek, mevcut kodu değiştirmeden yapılmalıdır) uygun bir yaklaşım sunar.**
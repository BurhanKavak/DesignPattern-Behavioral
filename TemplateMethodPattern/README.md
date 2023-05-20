## :diamond_shape_with_a_dot_inside: Template Method Pattern

**Template Method, Behavioral (Davranışsal) tasarım desenlerinden biridir. Template Method deseni, bir algoritmanın iskeletini belirlerken bazı adımları alt sınıflara bırakmayı ve böylece alt sınıfların bu adımları kendilerine özgü şekilde uygulamasını sağlar. Bu desen, bir algoritmanın genel yapısını tanımlarken, bazı adımların değişebilir veya özelleştirilebilir olmasını sağlar.**

**Template Method desenindeki ana bileşenler şunlardır:**

1. **AbstractClass (Soyut Sınıf): Algoritmanın genel yapısını tanımlayan sınıftır. AbstractClass, bir template method (şablon metodu) içerir ve bu metot, algoritmanın adımlarını belirler. Bazı adımlar, alt sınıflara bırakılır ve bu adımların nasıl uygulanacağı alt sınıflarda belirlenir.**
2. **ConcreteClass (Somut Sınıf): AbstractClass'ı uygulayan alt sınıflardır. ConcreteClass, abstract sınıftaki belirli adımları kendilerine özgü şekilde gerçekleştirir.**

**Template Method deseni, bir algoritmanın genel yapısını tanımlamak ve bazı adımları alt sınıflara bırakmak için kullanılır. Bu sayede, algoritmanın farklı bölümlerini alt sınıflar özelleştirerek, algoritmanın davranışını değiştirebiliriz.**

**Örneğin, bir oyun programı düşünelim. Oyunda farklı karakterler bulunabilir ve her bir karakterin hareket etme şekli farklı olabilir. Template Method deseni, Character (Karakter) sınıfında genel bir hareket etme algoritması tanımlar. Bu algoritmanın bazı adımları, örneğin hızı veya hareket mesafesi, alt sınıflara bırakılır ve alt sınıflar bu adımları kendilerine özgü şekilde gerçekleştirir. Böylece, her karakterin kendine özgü hareket etme davranışı olabilir.**

**Bu şekilde, Template Method deseni, bir algoritmanın iskeletini belirlerken bazı adımların alt sınıflara bırakılmasını sağlar. Bu desen, kod tekrarını azaltır, esneklik ve özelleştirme imkanı sağlar ve alt sınıflar arasında ortak bir yapı oluşturur.**
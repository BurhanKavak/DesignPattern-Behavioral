## :diamond_shape_with_a_dot_inside: Strategy Pattern

**Strategy, Behavioral (Davranışsal) tasarım desenlerinden biridir. Strategy deseni, algoritmaları soyutlayarak bir nesneye dinamik olarak farklı bir algoritma uygulama imkanı sağlar. Bu desen, nesne davranışlarının değişebilmesini ve çalışma zamanında esnek bir şekilde değiştirilebilmesini sağlar.**

**Strategy desenindeki ana bileşenler şunlardır:**

1. **Context (Bağlam): Algoritmayı kullanan nesnedir. Context sınıfı, bir Strategy nesnesi üzerinden algoritmayı çağırır ve sonucunu elde eder.**
2. **Strategy (Strateji): Farklı algoritmaları temsil eden sınıflardır. Her bir Strategy sınıfı, Context nesnesi tarafından çağrılarak algoritmasını gerçekleştirir.**

**Strategy deseni, bir nesnenin farklı işlemlerini veya algoritmalarını değiştirmek ve bunları dinamik olarak uygulamak istediğimiz durumlarda kullanışlıdır. Bu desen, algoritmaların soyutlanmasını ve değiştirilebilirliğini sağlar. Böylece, Context sınıfının davranışı, çalışma zamanında değiştirilebilir ve uygulanan algoritma kolayca değiştirilebilir.**

**Örneğin, bir ödeme işlemi gerçekleştiren bir uygulama düşünelim. Ödeme işlemini yaparken farklı ödeme yöntemleri kullanmak isteyebiliriz: kredi kartı, banka transferi, PayPal vb. Her bir ödeme yöntemi için farklı bir algoritma veya işlem süreci olabilir. Strategy deseni, her bir ödeme yöntemini temsil eden ayrı Strategy sınıfları oluşturur. Context sınıfı, ödeme işlemini gerçekleştirirken seçilen ödeme yöntemine göre ilgili Strategy sınıfını kullanır.**

**Bu şekilde, Strategy deseni nesnenin farklı algoritmalarını dinamik olarak değiştirebilme ve esnek bir şekilde kullanabilme imkanı sağlar. Bu desen, bir nesnenin davranışının çalışma zamanında değişmesi gerektiği durumlarda kullanılır ve kod tekrarını önler, bakımı kolaylaştırır ve genişletilebilirlik sağlar.**
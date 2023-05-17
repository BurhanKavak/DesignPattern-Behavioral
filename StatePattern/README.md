## :diamond_shape_with_a_dot_inside: State Pattern

**State, Behavioral (Davranışsal) tasarım desenlerinden biridir. State deseni, bir nesnenin davranışını durumuna bağlı olarak değiştirmek için kullanılır. Bu desen, bir nesnenin iç durumunu temsil eden ayrı durum sınıflarını kullanarak, durum değişikliklerini kolayca yönetmeyi sağlar.**

**State desenindeki ana bileşenler şunlardır:**

1. **Context (Bağlam): Durumu değişen nesnedir. Context sınıfı, durumu temsil eden State nesnesine sahiptir ve bu nesneyi kullanarak davranışlarını değiştirir.**
2. **State (Durum): Farklı durumları temsil eden sınıflardır. Her durum sınıfı, Context nesnesinin davranışını belirleyen metotları içerir.**

**State deseni, bir nesnenin farklı durumlarına sahip olduğu durumlarda kullanışlıdır. Nesnenin davranışları duruma bağlı olarak değişebilir ve yeni durumlar eklendikçe sisteme kolayca entegre edilebilir. Bu desen, durum makineleri veya iş akışları gibi duruma dayalı sistemlerin tasarımında etkilidir.**

**Örneğin, bir sipariş yönetim uygulaması düşünelim. Siparişin farklı durumları olabilir: "Yeni", "Hazırlanıyor", "Kargoya Verildi", "Teslim Edildi" gibi. Her durum için farklı işlemler yapılması gerekebilir. Bu durumda, her bir durumu temsil eden ayrı State sınıfları oluşturulur. Context sınıfı, mevcut durumu tutar ve durum değişikliklerini yönetir. Durum değiştiğinde, Context sınıfı ilgili State sınıfını kullanarak davranışlarını günceller.**

**Bu şekilde, State deseni nesnenin davranışını duruma bağlı olarak yönetir ve durum değişikliklerini daha esnek ve sürdürülebilir hale getirir. Bu desen, bir nesnenin durumuna göre farklı davranışlar sergilemesi gereken durumlarda kullanılır.**
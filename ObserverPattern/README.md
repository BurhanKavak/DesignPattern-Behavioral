## ## :diamond_shape_with_a_dot_inside: Observer Pattern
**Observer, Behavioral (Davranışsal) tasarım desenlerinden biridir. Observer deseni, nesneler arasında bir bağımlılık ilişkisi kurarak, bir nesnenin durumu değiştiğinde otomatik olarak bağımlı nesnelere bildirim gönderilmesini sağlar.**

**Observer deseni genellikle yayınlayıcı (publisher) ve abone (subscriber) yapıları arasında kullanılır. Yayınlayıcı, bir konuyu veya olayı temsil eden ve durumu değiştiren bir nesnedir. Aboneler ise bu konuyu veya olayı takip eden ve durum değişikliklerinden haberdar olmak isteyen nesnelerdir.**

**Observer desenindeki ana bileşenler şunlardır:**

1. **Subject (Konu): Durumu değişebilen nesnedir. Konu, bir veya daha fazla gözlemciyi takip eder ve durumu değiştiğinde gözlemcilere bildirim gönderir.**
2. **Observer (Gözlemci): Durumu izleyen ve konudan gelen bildirimleri alan nesnelerdir. Gözlemciler, konuya kayıt olarak durum değişikliklerinden haberdar olurlar ve ilgili işlemleri gerçekleştirirler.**

**Observer deseni, yazılım sistemlerinde değişikliklerin yayılması gerektiği durumlarda kullanışlıdır. Örneğin, bir haber sitesinde yeni bir haber yayınlandığında, abonelerin (kullanıcılar veya diğer sistemler) otomatik olarak haberdar edilmesi gerekebilir. Bu durumda, haber sitesi konu olarak kullanılırken, aboneler gözlemci olarak görev yapar.**

**Örnek olarak, bir hava durumu uygulaması düşünelim. Hava durumu istasyonu, hava durumu bilgilerini periyodik olarak günceller ve bu bilgilerin diğer bileşenlere iletilmesini sağlar. Hava durumu bilgilerini takip etmek isteyen kullanıcılar veya diğer bileşenler ise gözlemci olarak hareket eder. Herhangi bir hava durumu güncellemesi yapıldığında, istasyon otomatik olarak tüm gözlemcilere haber verir ve yeni hava durumu bilgileri alınır.**

**Bu şekilde, Observer deseni nesneler arasında gevşek bağımlılıklar oluşturarak dinamik ve esnek bir iletişim sağlar. Bu desen, nesneler arasındaki iletişimi kolaylaştırır ve sistemdeki değişikliklerin yayılmasını etkinleştirir.**
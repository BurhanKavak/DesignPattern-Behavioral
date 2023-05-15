## :diamond_shape_with_a_dot_inside: Iterator Pattern

**Iterator tasarım deseni, bir nesne koleksiyonundaki elemanlara erişmek ve bunlar üzerinde işlem yapmak için kullanılan bir tasarım desenidir. Bu desen, koleksiyonu oluşturan nesnelerden bağımsız olarak koleksiyon elemanlarına erişim sağlar.**

**Iterator tasarım deseni, ayrıca "Cursor" tasarım deseni olarak da bilinir ve koleksiyonun farklı elemanlarına erişim sağlamak için bir dizi araçlar sağlar. Iterator tasarım deseni, nesne koleksiyonlarının sıralı olarak gezinilmesine ve her elemanın ayrı ayrı işlenmesine olanak tanır.**

**Bu tasarım deseni, özellikle veri yapılarındaki ve nesne koleksiyonlarındaki elemanları dolaşmak ve işlemek için yaygın olarak kullanılır. Iterator tasarım deseninin amacı, koleksiyonun türünden bağımsız olarak elemanlara erişimi sağlamak ve işlemek için standart bir arayüz sağlamaktır.**

**Iterator tasarım deseninin özellikleri:**

- **Iterator tasarım deseni, nesne koleksiyonlarının elemanlarına sıralı olarak erişim sağlar.**
- **Bu tasarım deseni, bir koleksiyon elemanına erişmek için bir arayüz sağlar ve koleksiyon elemanlarının türünden bağımsızdır.**
- **Iterator tasarım deseni, bir nesne koleksiyonundaki elemanları işlemek için standart bir arayüz sağlar.**
- **Bu tasarım deseni, nesne koleksiyonlarındaki elemanları değiştirmeden elemanları dolaşmanızı sağlar.**

**Örnek olarak, bir dizi içindeki elemanlara erişmek ve her bir elemanı işlemek istediğinizi düşünelim. Iterator tasarım deseni, bu dizideki elemanlara erişmek için standart bir arayüz sağlar. Bu arayüz, her elemanı ayrı ayrı işlemek için gereken yöntemleri sağlar. Ayrıca, dizi içindeki elemanların türünden bağımsızdır, bu nedenle farklı türlerdeki nesne koleksiyonları için de kullanılabilir.**
# Java-Generics.md
### Sınıf özellikleri :
- Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.
- Sınıfa ait iki tür constructor metot bulunmalı
- <b>MyList()</b> : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
- <b>MyList(int capacity)</b> : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
- <b>size()</b> : dizideki eleman sayısını verir.
- <b>getCapacity()</b> : dizinin kapasite değerini verir.
- <b>add(T data)</b> : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
- <b>get(int index)</b>: verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
- <b>remove(int index)</b>: verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
- <b>set(int index, T data)</b> : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.
- <b>String toString()</b> : Sınıfa ait dizideki elemanları listeleyen bir metot.
- <b>int indexOf(T data)</b> : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
- <b>int lastIndexOf(T data)</b> : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
- <b>boolean isEmpty()</b> : Listenin boş olup olmadığını söyler.
- <b>T[] toArray()</b> : Listedeki öğeleri, aynı sırayla bir array haline getirir.
- <b>clear()</b> : Listedeki bütün öğeleri siler, boş liste haline getirir.
- <b>MyList<T> sublist(int start,int finish)</b : Parametrede verilen indeks aralığına ait bir liste döner.
- <b>boolean contains(T data)</b> : Parametrede verilen değerin dizide olup olmadığını söyler.

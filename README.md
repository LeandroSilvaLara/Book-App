# Kotlin Multiplatform Project  

Este é um projeto Kotlin Multiplatform que tem como alvo as plataformas **Android**, **iOS** e **Desktop**. O projeto utiliza Compose Multiplatform para criar interfaces compartilhadas entre diferentes sistemas operacionais.  

## Estrutura do Projeto  

### 📂 `/composeApp`  
Essa pasta contém o código compartilhado entre as aplicações que utilizam Compose Multiplatform. Ela está organizada em subdiretórios específicos:  
- **`commonMain`**: Contém o código comum para **todas as plataformas**. Essa é a base do código que será reutilizado.  
- **Outros subdiretórios**: Há pastas específicas para cada plataforma, permitindo a escrita de código Kotlin exclusivo para aquele ambiente.    
    - Exemplo: Se você precisar utilizar a biblioteca **CoreCrypto** da Apple no seu aplicativo iOS, o lugar adequado para esse código seria o diretório **`iosMain`**.  

---

### 📂 `/iosApp`  
Essa pasta contém o código específico para aplicativos iOS.  
Mesmo que a interface do usuário seja compartilhada usando Compose Multiplatform, o aplicativo iOS requer um ponto de entrada nativo.  
- **SwiftUI**: Adicione o código SwiftUI necessário para complementar funcionalidades ou integrar recursos específicos da plataforma iOS.  

---

### Recursos Adicionais  
Para mais detalhes sobre o desenvolvimento com Kotlin Multiplatform, consulte a documentação oficial:  
👉 [Guia de Introdução ao Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)  

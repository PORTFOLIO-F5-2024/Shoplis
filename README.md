# 🛒 Simulador de Carrito de Compras

## 📖 Descripción
Este proyecto es un simulador de carrito de compras que incluye diferentes tipos de productos. Permite añadir productos al carrito, aplicar descuentos específicos y calcular el precio total del carrito.

## 📋 Tabla de Contenidos
1. [🚀 Instalación](#-instalación)
2. [💻 Uso](#-uso)
3. [📂 Estructura del Proyecto](#-estructura-del-proyecto)
4. [✨ Características](#-características)
5. [🤝 Contribución](#-contribución)
6. [👥 Autores](#-autores)
7. [📜 Licencia](#-licencia)

## 🚀 Instalación
1. Clona el repositorio:
    ``` bash 
   git clone [https://github.com/PORTFOLIO-F5-2024/Shoplis.git]

2. Abre el proyecto en tu IDE favorito que soporte Java.
3. Compila y ejecuta la clase `Main`.

## 💻 Uso
Para utilizar el simulador de carrito:
1. Ejecuta la clase `Main`.
2. Añade productos al carrito usando los métodos disponibles en consola.
3. Aplica descuentos y calcula el precio total del carrito.

## 📂 Estructura del Proyecto

### Diagrama de Clases
![Diagrama relación clases](ruta/diagrama.png)

### 🗂️ Estructura de Clases

#### 🏷️ Clase Abstracta: `Product`
- **Atributos**:
   - `nameProduct` 📛: Nombre del producto
   - `priceProduct` 💰: Precio del producto
- **Método protegido**:
   - `applyDiscount()` 📉: Método abstracto para aplicar descuento en las subclases

### 🛍️ Subclases de `Product`

#### 1. 🍏 Clase `FoodProduct`
- **Atributos**:
   - `discount` 🤑: Porcentaje de descuento aplicable
   - `priceApplyDiscount` 💵: Precio después de aplicar el descuento
- **Métodos**:
   - `applyDiscount()`:
      - Calcula el precio con descuento basado en el porcentaje especificado.
      - Si el descuento es 0, se cobra el precio original.

#### 2. 📚 Clase `BookProduct`
- **Atributos**:
   - `author` ✍️: Autor del libro
   - `description` 📝: Descripción del libro
   - `discount` 📉: Porcentaje de descuento aplicable
   - `priceApplyDiscount` 💵: Precio después de aplicar el descuento
- **Métodos**:
   - `applyDiscount()`:
      - Si el descuento es superior al 10%, se reduce a 0%.
      - Calcula el precio después de aplicar el descuento permitido.

#### 3. 🎁 Clase `FreeProduct`
- **Atributos**:
   - `discount` 💯: Siempre es del 100% ya que el producto es gratuito.
- **Métodos**:
   - `applyDiscount()`:
      - Aplica un descuento del 100%, haciendo el producto gratuito.

### 🛒 Clase `Cart`
- **Atributos**:
   - `productsCart` 🛍️: Lista de productos añadidos al carrito
- **Métodos**:
   - `viewCart()` 👁️: Muestra los productos actuales en el carrito
   - `addCart()` ➕: Añade un producto al carrito
   - `deleteCart()` ❌: Elimina un producto del carrito
   - `sumPriceProduct()` 💲: Suma el precio total de los productos en el carrito considerando los descuentos aplicados

### 🎬 Clase `Main`
- **Función principal**:
   - Crea instancias de productos y las añade al carrito.
   - Muestra el carrito y calcula el precio total.
   - Aplica descuentos a los productos según la lógica definida.

## ✨ Características
- ✔️ Gestión de diferentes tipos de productos en un carrito de compras.
- 🏷️ Aplicación de descuentos específicos según el tipo de producto:
   - 🍏 Descuento configurable para productos de tipo `FoodProduct`.
   - 📚 Descuento máximo del 10% para productos de tipo `BookProduct`.
   - 🎁 Productos gratuitos (`FreeProduct`) con un 100% de descuento.
- 💰 Cálculo del precio total del carrito con los descuentos aplicados.

## 🤝 Contribución
Si deseas contribuir al proyecto:
1. Crea una nueva rama
   ``` bash 
   git checkout -b feature/nuevaCaracterística
2. Realiza tus cambios y haz commit
    ``` bash
   git commit -m 'Añadir nueva característica'
3. Haz push a la rama
    ``` bash
   git push origin feature/nuevaCaracterística
4. Abre un Pull Request 📨
    ``` bash
   git pull 
5. Abre una pull request en GitHub.

## 👥 Autores

Paula Calvo ![https://www.linkedin.com/in/paulacalvogarcia2001/]( icons8-linkedin-48.png.url "Logo linkedIn")
## 📜 Licencia
Este proyecto está bajo la Licencia MIT - mira el archivo LICENSE para más detalles.

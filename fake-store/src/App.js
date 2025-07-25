import { useEffect, useState } from "react";
import ProductList from "./ProductList";
import "./App.css";

function App() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then((res) => res.json())
      .then((data) => setProducts(data));
  }, []);

  const processedProducts = products
    .map(product => ({
      ...product,
      price: product.price * 0.2
    }))
    .filter(product => product.rating.rate > 4.0);

  return (
    <div className="app">
      <h1>FakeStore Products</h1>
      <ProductList products={processedProducts} />
    </div>
  );
}

export default App;

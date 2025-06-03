import { useState, useEffect } from "react";

export default function App() {
  const [name, setName] = useState("");
  const [count, setCount] = useState(0);

  useEffect(() => {
    document.title = `You clicked ${count} times`;
  }, [count]);

  return (
    <div className="p-5">
      <h1 className="text-2xl font-bold mb-4">React Hooks Demo</h1>

      {/* useState: Input name */}
      <div className="mb-4">
        <input
          type="text"
          placeholder="Enter your name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          className="border p-2 rounded"
        />
        {name && <p className="mt-2 text-lg">Hello, {name}!</p>}
      </div>

      {/* useState: Click button counter */}
      <div className="mb-4">
        <button
          onClick={() => setCount(count + 1)}
          className="bg-blue-500 text-white px-4 py-2 rounded"
        >
          Click me!
        </button>
        <p className="mt-2">You clicked {count} times!</p>
      </div>
    </div>
  );
}

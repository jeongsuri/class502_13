import { Routes, Route } from "react-router-dom";

import Home from "./Pages/Home";
import About from "./Pages/About";
import Board from "./Pages/Board";
import BoardList from "./Pages/BoardList";

import MainLayout from "./layouts/MainLayout";
import NotFound from "./Pages/NotFound";

const App = () => {
  return (
    <Routes>
      <Route element={<MainLayout />}>
        <Route index element={<Home />} />
        <Route path="about" element={<About />} />
        <Route path="board" element={<BoardList />} />
        <Route path="*" element={<NotFound />} />
      </Route>
    </Routes>
  );
};
export default App;

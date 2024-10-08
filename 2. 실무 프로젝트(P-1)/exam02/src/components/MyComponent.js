
import propTypes from 'prop-types';

const MyComponent = ({name,num,children}) => {
    return(
        <>
        <div>안녕하세요, 제 이름은 {name}입니다.</div>
        <div>좋아하는 숫자는 {num}입니다.</div>
        {children}
        </>
    );
};
MyComponent.defaultProps = {
    name: '기본이름',
};

MyComponent.propTypes = {
    name: propTypes.string,
    num : propTypes.number.isRequired,
}
export default MyComponent;

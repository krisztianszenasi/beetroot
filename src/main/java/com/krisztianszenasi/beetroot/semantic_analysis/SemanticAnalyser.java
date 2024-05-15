//package com.krisztianszenasi.beetroot.semnatic_analysis;
//
//import com.krisztianszenasi.beetroot.ast.nodes.FileNode;
//import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
//import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
//import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
//import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
//import com.krisztianszenasi.beetroot.semnatic_analysis.type.BSDeclarationTypeBuilder;
//import com.krisztianszenasi.beetroot.semnatic_analysis.type.BSTypeSystem;
//
//public class SemanticAnalyser extends AstVisitor<Void> {
//
//    private Scope current = new Scope();
//    private BSTypeSystem typeSystem = new BSTypeSystem();
//    private BSDeclarationTypeBuilder typeBuilder = new BSDeclarationTypeBuilder();
//
//    @Override
//    public Void visitFileNode(FileNode node) {
//        return visit(node.getBlock());
//    }
//
//    @Override
//    public Void visitBlockNode(BlockNode node) {
//        enterBlock();
//        for(StatementNode statement : node.getStatements()) {
//            visit(statement);
//        }
//        leaveBlock();
//        return null;
//    }
//
//    @Override
//    public Void visitVariableDeclarationNode(VariableDeclarationNode node) {
//
//    }
//
//    private void enterBlock() {
//        current = new Scope(current);
//    }
//
//    private void leaveBlock() {
//        current = current.getPrevious();
//    }
//}

# Comando do compilador Java
JAVAC=javac
# Comando da JVM
JAVA=java
# Caminho para o arquivo JAR do ANTLR
ANTLR_PATH=/Users/joaoloss/Documents/UFES/compiladores/lab2/tools/antlr-4.13.2-complete.jar
# Opção de configuração do CLASSPATH para o ambiente Java
CLASS_PATH_OPTION=-cp .:$(ANTLR_PATH)
# Configuração do comando de compilação do ANTLR
ANTLR4=$(JAVA) -jar $(ANTLR_PATH)
# Configuração do ambiente de teste do ANTLR
GRUN=$(JAVA) $(CLASS_PATH_OPTION) org.antlr.v4.gui.TestRig
# Nome da gramática
GRAMMAR_NAME=EZ
# Regra inicial da gramática
INITIAL_RULE=program
# Nome arquivo do lexer
LEXER_NAME=EZLexer.g
# Nome do arquivo do parser
PARSER_NAME=EZParser.g
# Diretório para aonde vão os arquivos gerados
GEN_PATH=parser
# Diretório de entrada dos arquivos de teste
IN_DIR=../in
# Diretório de saída dos arquivos de teste
OUT_DIR=../out

# Executa o ANTLR e o compilador Java
all: antlr javac
# Executa o ANTLR para compilar a gramática
antlr:
	$(ANTLR4) -no-listener  -o $(GEN_PATH) $(LEXER_NAME) $(PARSER_NAME)
# Executa o javac para compilar os arquivos gerados
javac:
	$(JAVAC) $(CLASS_PATH_OPTION) $(GEN_PATH)/*.java
# Roda os arquivos de teste usando o TestRig do ANTLR
run:
	mkdir -p out
	cd $(GEN_PATH) && \
	for FILE in $(IN_DIR)/*; do \
		BASENAME=$$(basename $$FILE); \
		echo "Processing $$BASENAME"; \
		$(GRUN) $(GRAMMAR_NAME) $(INITIAL_RULE) -tree $$FILE > $(OUT_DIR)/$$BASENAME.tokens 2>&1; \
	done
# Roda um arquivo de teste específico usando o TestRig do ANTLR
runone:
	cd $(GEN_PATH) && \
	$(GRUN) $(GRAMMAR_NAME) $(INITIAL_RULE) -gui $(FILE)
# Remove os arquivos gerados pelo ANTLR
clean:
	@rm -rf $(GEN_PATH)